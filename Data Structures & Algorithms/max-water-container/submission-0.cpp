class Solution {
public:
    int maxArea(vector<int>& heights) {
        int l=0,r=heights.size()-1;
        int res=0;
        while(r>=l){
            int width=r-l;
            int h=min(heights[r],heights[l]);
            if(heights[r]>heights[l]){
                l++;
            }else{
                r--;
            }
            res=max(res,width*h);
        }
        return res;
    }
};
